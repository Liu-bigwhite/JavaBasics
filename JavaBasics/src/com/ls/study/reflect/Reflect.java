package com.ls.study.reflect;

import com.ls.study.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
		4. 获取全类名
			* String getName()
 */
public class Reflect {

    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        //test1(personClass);
        //test2(personClass);
        test3(personClass);

        String name = personClass.getName();
        System.out.println(name);

    }

    /*
    3. 获取成员方法们：
			* Method[] getMethods()
			* Method getMethod(String name, 类<?>... parameterTypes)

			* Method[] getDeclaredMethods()
			* Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     */
    public static void test3(Class<Person> personClass) throws Exception{
        Method method = personClass.getMethod("eat");

        Person person = new Person();

        method.invoke(person);

        Method[] methods = personClass.getMethods();
        for (Method method1 : methods) {
            String name = method1.getName();
            System.out.println(name);
            System.out.println(method1);

        }
    }

    /*
   2. 获取构造方法们
           * Constructor<?>[] getConstructors()
           * Constructor<T> getConstructor(类<?>... parameterTypes)

           * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
           * Constructor<?>[] getDeclaredConstructors()
    */
    public static void test2(Class<Person> personClass) throws Exception{
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //使用newInstance(Object... initargs) 创建对象
        Person person = constructor.newInstance("李四", 18);
        System.out.println(person);

        System.out.println("=================================");
        //如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
        Constructor<Person> constructor1 = personClass.getConstructor();
        Person person1 = constructor1.newInstance();
        System.out.println(person1);

        Person person2 = personClass.newInstance();

        System.out.println(person2);
    }

    /*
    1. 获取成员变量们
			* Field[] getFields() ：获取所有public修饰的成员变量
			* Field getField(String name)   获取指定名称的 public修饰的成员变量

			* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
			* Field getDeclaredField(String name)
     */
    public static void test1(Class<Person> personClass) throws Exception {
        //getFields() ：获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //getField(String name)   获取指定名称的 public修饰的成员变量
        Field a = personClass.getField("a");
        Person person = new Person();
        //获取成员变量的值
        Object value = a.get(person);
        System.out.println(value);
        //设置成员变量的值
        a.set(person,12);
        System.out.println(person);

        System.out.println("=================================");

        //getDeclaredFields()  获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        //getDeclaredField(String name)
        Field d = personClass.getDeclaredField("d");
        //忽略访问权限修饰符的安全检查
        d.setAccessible(true);
        Object value2 = d.get(person);
        System.out.println("value2:"+value2);
    }


}
