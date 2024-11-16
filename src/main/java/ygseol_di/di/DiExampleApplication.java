package ygseol_di.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DiExampleApplication {

    public static void main(String[] args) {

        Store store = new Store();

        Pencil pencil = new Pencil();

        Ball ball = new Ball();
        Product product = new Product(ball);
        product(pencil);
    }

}
