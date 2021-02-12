package com.TestNGTutorials.TestNGDataProvider;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import Utils.TestNGTutConstants;



public class test_DataProvider1 {
	
	
	Properties studentRecordsProps = null;
	
	//Excel Data handling
	public static HSSFWorkbook workbook;
    public static HSSFSheet worksheet;
    public static DataFormatter formatter= new DataFormatter();
    public static String file_location =null;
    static String SheetName= "Sheet1";
    
	
	@BeforeClass
	public void init() throws Exception
	{
		studentRecordsProps = new Properties();
		studentRecordsProps
				.load(new FileInputStream(getFileAbsolutePath( TestNGTutConstants.STUDENT_DATA_PROPS_FILE)));
		
		file_location=getFileAbsolutePath( TestNGTutConstants.STUDENT_DATA_EXCEL_FILE);
		
	}
	

	
	//Simple Dataprovider
	@DataProvider(name="loginNames")
	public Object[][] printLoginNames()
	{
		return new Object[][] {
			{"smith"},
			{"jhon"}
		};
	}
	
  @Test(dataProvider = "loginNames")
  public void testMultipleLoginNames(String loginname) {
	  print(loginname);
  }
  
  public void print(String msg)
  {
	  out.println(msg);
  }
  
  
  /**
   * name rolnumber 3 records
   */
  @DataProvider (name="studentdp")
  public Object[][] getStudentData(){
	  
	  Object[][] inputData=new Object[3][2];
	  
	  //1st record
	  inputData[0][0]="jhon";
	  inputData[0][1]="10";

	  
	  //2nd record
	  inputData[1][0]="smith";
	  inputData[1][1]="20";
	  
	  //3rd record
	  inputData[2][0]="alex";
	  inputData[2][1]="30";
	  
	  return inputData;
  }
  
  @Test(dataProvider = "studentdp")
  public void testStudentData(String stname, String stRollNumber)
  {
	  print(stname);
	  print(stRollNumber);
  }
  
  /**
   * Data provider to read the data from the file
   */
  @DataProvider(name="studentrecords")
  public Object[][] getStudentRecords()
  {
	  Object[][] inputData = new Object[studentRecordsProps.size()][2];
		int j=0;

		for(String key:studentRecordsProps.stringPropertyNames() )
		{
			inputData[j][0] = key;
			inputData[j][1] = studentRecordsProps.get(key);
			j++;
		}
		
		return inputData;
  }
  
  @Test(dataProvider = "studentrecords")
  public void testStudentRecordsFromProps(String stname, String stRollNumber)
  {
	  print(stname);
	  print(stRollNumber);
  }
  
  
  /**
   * Data provider from Excel
   * @param dataLocationConstant
   * @return
   */
  @DataProvider (name="excelDp")
  public static Object[][] ReadVariant() throws IOException
  {
  FileInputStream fileInputStream= new FileInputStream(file_location); //Excel sheet file location get mentioned here
      workbook = new HSSFWorkbook(fileInputStream); //get my workbook 
      worksheet=workbook.getSheet(SheetName);// get my sheet from workbook
      HSSFRow Row=worksheet.getRow(0);     //get my Row which start from 0   
   
      int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
      int ColNum= Row.getLastCellNum(); // get last ColNum 
       
      Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
       
          for(int i=0; i<RowNum-1; i++) //Loop work for Rows
          {  
              HSSFRow row= worksheet.getRow(i+1);
               
              for (int j=0; j<ColNum; j++) //Loop work for colNum
              {
                  if(row==null)
                      Data[i][j]= "";
                  else
                  {
                      HSSFCell cell= row.getCell(j);
                      if(cell==null)
                          Data[i][j]= ""; //if it get Null value it pass no data 
                      else
                      {
                          String value=formatter.formatCellValue(cell);
                          Data[i][j]=value; //This formatter get my all values as string i.e integer, float all type data value
                      }
                  }
              }
          }

      return Data;
  }
  
  @Test(dataProvider = "excelDp")
  public void testStudentRecordsFromExcel(String Rating, String Name
		  )
  {
	  print(Rating);
	  print(Name);
	  
	  //Rating	Name	Default Tags	Ignore Tag	Custom Tags	Category	Allowed URL/IP	Sessions	Traffic	Uploads	Downloads	Users	Destinations	Platforms	Avg Duration	Embedded URLs
  }
  

  
  public static String getFileAbsolutePath(String dataLocationConstant){
		return System.getProperty("user.dir") + org.apache.commons.io.FilenameUtils.separatorsToSystem(dataLocationConstant); 
	}
  
  
  
}
