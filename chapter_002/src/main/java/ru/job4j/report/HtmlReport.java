package ru.job4j.report;

public class HtmlReport extends TextReport {
    public String generate (String name, String body){
        return "<h1>" + name + "</h1>" +
                "<br/>" +
                "<span>" + body + "</span>";
    }
}
