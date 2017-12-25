# JUnit Dataprovider

This is a Example Repository to use TestNG's Dataprovider in a JUnit based Framework.
 - [TNG's JUnit-Dataprovider](https://github.com/TNG/junit-dataprovider)
 - Written in **JAVA**
 - Implemented using **JUnit 4**
 - Build Tool - Maven
 - Excel JUnit @DataProvider
---
### Reporting
 - [Allure Reporting](http://allure.qatools.ru/)
---

### Usage
```sh
$ git clone https://github.com/GladsonAntony/JUnit4-Dataprovider.git
$ mvn clean test
$ mvn site
```
---
### @DataProviders

**__Method 1:__**
 - Create Excel Workbook with the same name as your method Name.
```java
@DataProvider
public static Object[][] excelSheetNameAsMethodName(FrameworkMethod method) throws Exception
{
	File file = new File("./src/test/resources/Excel Files/"+method.getName()+".xlsx");
	System.out.println("Opening Excel File:" +file.getAbsolutePath());
	Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
	return testObjArray;
}
 ```

 **__Method 2:__**
 - Create Excel Workbook's Sheet with the same name as your method Name.
```java
@DataProvider
public static Object[][] multiSheetExcelRead(FrameworkMethod method) throws Exception
{
	File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
	String SheetName = method.getName();
	System.out.println(SheetName);
	Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
	return testObjArray;
}
 ```
 ---
 
 ### @DataProvider Usuage
```java
@Test
@UseDataProvider("excelSheetNameAsMethodName")
public void testAdd(Double a, Double b, Double expected) 
{	}

@UseDataProvider("multiSheetExcelRead")
@Test
public void testAdd(Double a, Double b, Double expected)
{	}

```

