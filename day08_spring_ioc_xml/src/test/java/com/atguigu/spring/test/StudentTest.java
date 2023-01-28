package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xujian
 * @create 2023-01-09 16:44
 */
public class StudentTest {

    @Test
    public void testSix(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Clazz clazz = ioc.getBean("ClazzTwo", Clazz.class);
        System.out.println(clazz.getStudents());
        //[Student{sid=1001, sname='李梅', age=23, gender='男', clazz=Clazz{clazzId=1, clazzName='高三五班', students=null}, hobbies=null},
        // Student{sid=1001, sname='李梅', age=23, gender='男', clazz=Clazz{clazzId=10, clazzName='高三16班', students=null}, hobbies=null},
        // Student{sid=1001, sname='李梅', age=23, gender='男', clazz=Clazz{clazzId=10, clazzName='高三16班', students=null}, hobbies=[学习, 唱歌, 开发]}]

    }

    @Test
    public void testFive(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentFour = ioc.getBean("studentNine", Student.class);
        System.out.println(studentFour);
    }
    @Test
    public void testFour(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentFour = ioc.getBean("studentTen", Student.class);
        System.out.println(studentFour);
        //Student{sid=1001, sname='李梅', age=23, gender='男', clazz=Clazz{clazzId=1, clazzName='高三五班'}}
    }

    @Test
    public void testThree(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student studentFour = ioc.getBean("studentFour", Student.class);
        System.out.println(studentFour);

    }

    @Test
    public void testTwo(){
        //获取ioc对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        Student bean = ioc.getBean("studentTwo", Student.class);
        System.out.println(bean);

        Student bean2 = ioc.getBean("studentThree", Student.class);
        System.out.println(bean2);
    }
    @Test
    public void testOne(){
        //获取ioc对象
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取bean
        
        //方式1：根据bean的id获取
        //Student bean = (Student)ioc.getBean("studentOne");

        //方式2：根据bean的类型获取
            //条件要去ioc容器中有且只有一个类型匹配的bean
            /*注意如果在Spring的配置文件中存在
            <bean id="studentOne" class="com.atguigu.spring.pojo.Student"></bean>
            <bean id="studentTwo" class="com.atguigu.spring.pojo.Student"></bean>
            则使用方式2就会报错：NoUniqueBeanDefinitionException*/
//        Student bean2 = ioc.getBean(Student.class);
        //方式3：
        Student bean3 = ioc.getBean("studentOne", Student.class);

    }
}
