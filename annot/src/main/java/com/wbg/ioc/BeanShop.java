package com.wbg.ioc;


import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.net.URL;
import java.util.List;

public class BeanShop implements Shop{

    public BeanShop(String configXML){
        //创建SAXReader对象
        SAXReader saxReader=new SAXReader();
        //获取XML文件路径
        URL url= this.getClass().getClassLoader().getResource(configXML);
        try {
            //生成文档对应实体
            Document document=saxReader.read(url);

            List<Element> list=document.getRootElement().elements();

            for (Element element : list) {

                String id=element.attributeValue("id");
                String clazz=element.attributeValue("class");
                System.out.println(id);
                System.out.println(clazz);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
    @Override
    public Object getBen(String name) {
        return null;
    }
}
