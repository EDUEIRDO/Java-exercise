class Person {
  public String name;
  public int age;
  public float height;

  public Person(String name, int age, float height) {
    this.name = name;
    this.age = age;
    this.height = height;
  }

  void talk() {
    System.out.println("Meu nome é " + name);
  }

  void nextYear() {
    age++;
    System.out.println(name + " tem " + age);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public float getHeight() {
    return height;
  }
}

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Carlos", 20, 1.83f);
    Person person2 = new Person("Pessoa 2", 25, 1.72f);

    System.out.println("Pessoa 1: Nome = " + person1.name + ", Idade = " + person1.age + " e Altura = " + person1.height);
    System.out.println("Pessoa 2: Nome = " + person2.name + ", Idade = " + person2.age);
    // Alter value
    person1.name = "Carlos Silva";
    person1.nextYear();

    // Pos alterar
    System.out.println("Pessoa 1: Nome = " + person1.name + ", Idade = " + person1.age + " e Altura = " + person1.height);

  }
}
