# JUnit Dataprovider

This is a Example Repository to use TestNG's Dataprovider in a JUnit based Framework.
 - [TNG's JUnit-Dataprovider](https://github.com/TNG/junit-dataprovider)
 - Written in **JAVA**
 - Implemented using **JUnit 4**
 - Build Tool - Maven
 - Excel JUnit @DataProvider

---
### Usage
```sh
$ git clone https://github.com/GladsonAntony/JUnit4-Dataprovider.git
$ mvn clean test
```
---

### @DataProviders

**__Method 1:__**
 - Create Excel Workbook with the same name as your method Name.
```java
@DataProvider
public static Object[][] dataProviderAdd() throws Exception
{
	File file = new File("src/test/resources/Excel Files/testAdd.xlsx");
	System.out.println("Opening Excel File:" +file.getAbsolutePath());
	Object testObjArray[][] = ExcelUtils.getTableArray(file.getAbsolutePath());
	return testObjArray;
}
 ```
 ---
 
 ### @DataProvider Usuage
```java
@Test
@UseDataProvider("dataProviderAdd")
public void testAdd(String a, String b, String expected) 
{
	int result = Integer.parseInt(a) + Integer.parseInt(b);
	assertEquals(Integer.parseInt(expected), result);
}
```

