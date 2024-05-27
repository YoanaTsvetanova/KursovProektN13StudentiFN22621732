package bg.tu_varna.sit.b1.f22621732;

import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Map;

public class XMLFileHandler {

    private Document document;


    public void open(String filePath) {
        try {
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            document = dBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();
            System.out.println("XML file opened: " + filePath);
        } catch (Exception e) {
            System.out.println("An error occurred while opening the XML file.");
            e.printStackTrace();
            document = null;
        }
    }


    public void close() {
        document = null;
        System.out.println("XML document closed.");
    }


    public void save(String filePath) {
        if (document == null) {
            System.out.println("No document to save.");
            return;
        }
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);
            System.out.println("XML file saved: " + filePath);
        } catch (Exception e) {
            System.out.println("An error occurred while saving the XML file.");
            e.printStackTrace();
        }
    }
    public boolean containsStudent(String facultyNumber) {
        if (document == null) {
            return false;
        }
        NodeList studentNodes = document.getElementsByTagName("student");
        for (int i = 0; i < studentNodes.getLength(); i++) {
            Element studentElement = (Element) studentNodes.item(i);
            String facultyNumberInFile = studentElement.getElementsByTagName("facultyNumber").item(0).getTextContent();
            if (facultyNumber.equals(facultyNumberInFile)) {
                return true;
            }
        }
        return false;
    }



    public void saveAs(String newFilePath) {
        save(newFilePath);
    }


    public void addStudent(Student student) {
        if (document == null) {
            System.out.println("No document to add student to.");
            return;
        }
        Element root = document.getDocumentElement();
        Element studentElement = document.createElement("student");

        studentElement.appendChild(createElement("name", student.getName()));
        studentElement.appendChild(createElement("facultyNumber", student.getFacultyNumber()));
        studentElement.appendChild(createElement("specialty", student.getSpecialty()));
        studentElement.appendChild(createElement("currentCourse", String.valueOf(student.getCurrentCourse())));
        studentElement.appendChild(createElement("group", student.getGroup()));
        studentElement.appendChild(createElement("status", student.getStatus()));
        studentElement.appendChild(createElement("averageGrade", String.valueOf(student.getAverageGrade())));

        Element enrolledCoursesElement = document.createElement("enrolledCourses");
        for (Map.Entry<String, String> entry : student.getEnrolledCourses().entrySet()) {
            Element courseElement = document.createElement("course");
            courseElement.setAttribute("name", entry.getKey());
            courseElement.setTextContent(entry.getValue());
            enrolledCoursesElement.appendChild(courseElement);
        }
        studentElement.appendChild(enrolledCoursesElement);

        Element gradesElement = document.createElement("grades");
        for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
            Element gradeElement = document.createElement("grade");
            gradeElement.setAttribute("course", entry.getKey());
            gradeElement.setTextContent(String.valueOf(entry.getValue()));
            gradesElement.appendChild(gradeElement);
        }
        studentElement.appendChild(gradesElement);

        root.appendChild(studentElement);
        System.out.println("Added new student: " + student.getName());
    }


    private Element createElement(String tagName, String textContent) {
        Element element = document.createElement(tagName);
        element.setTextContent(textContent);
        return element;
    }


    public void printDocument() {
        if (document == null) {
            System.out.println("No document to print.");
            return;
        }
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);
            StreamResult console = new StreamResult(System.out);
            transformer.transform(source, console);
        } catch (Exception e) {
            System.out.println("An error occurred while printing the document.");
            e.printStackTrace();
        }
    }
}
