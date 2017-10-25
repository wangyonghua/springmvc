package com.example;


public class TestXml {
    public static void main(String[] args) {
        GetCountryListRQ getCountryListRQ = new GetCountryListRQ();
        Header header = new Header();
        header.setClientID("ABC");
        header.setLicenseKey("123456");
        getCountryListRQ.setHeader(header);
        try {
            String s = JaxbXmlUtil.convertToXml(getCountryListRQ, "utf-8");

            GetCountryListRQ getCountryListRQ1 = JaxbXmlUtil.convertToJavaBean(s, GetCountryListRQ.class);
            System.out.println(getCountryListRQ1.getHeader());

            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}