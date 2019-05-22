package ivmiit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =

        new AnnotationConfigApplicationContext(AppConfig.class);

//        MessageRenderer renderer = (MessageRenderer) context.getBean("renderer");

//        renderer.printMessage();


        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);
        renderer.print();
    }
}
