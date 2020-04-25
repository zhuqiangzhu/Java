package club.banyuan;
/**
src目录下的代码中的访问修饰符和一些代码被移除掉了。
请添加合适的代码让Main.java中的main方法正常运行。 不要修改main方法中的内容。*/
import  club.banyuan.animal.cat;
import  club.banyuan.animal.dog;
import  club.banyuan.Person.Person;
public class Main {

 public static void main(String[] args) {
    Person person = new Person();
    Cat cat = new Cat();
    cat.name = "汤姆";
    Dog dog = new Dog();
    dog.setName("小强");
    person.train(dog);
    dog.playWith(cat);
  }
}
