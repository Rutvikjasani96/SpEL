package com.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import org.springframework.expression.Expression;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);

        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = (Expression) temp.parseExpression("20+20");
        System.out.println(expression.getValue());
    }
}
