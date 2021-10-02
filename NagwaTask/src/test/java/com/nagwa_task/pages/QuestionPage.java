package com.nagwa_task.pages;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class QuestionPage extends BasePage{



    @FindBy(xpath="//div[@data-questionid]")
    private List<WebElement> listOfQuestions ;

    public  List<WebElement>  getListOfQuestions() {
        return listOfQuestions;
    }

    	public int getNumberOfQuestions(){
            List<WebElement> listOfQuestions = getListOfQuestions();
            int count = listOfQuestions.size();
            return count;

        }
	public  void saveCount () throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet spreadsheet
                = workbook.createSheet(" Qustion Number");
        XSSFRow row;
        Map<String, Object[]> studentData
                = new TreeMap<String, Object[]>();
        int count =getNumberOfQuestions();
        studentData.put(
                "1",
                new Object[] {"Question Number " ,String.valueOf(count)});
        Set<String> keyid = studentData.keySet();
        int rowid = 0;
        for (String key : keyid) {

            row = spreadsheet.createRow(rowid++);
            Object[] objectArr = studentData.get(key);
            int cellid = 0;

            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String)obj);
            }
        }
        FileOutputStream out = new FileOutputStream(
                new File("./CountQuestion.xlsx"));
        workbook.write(out);
        out.close();
    }

}


