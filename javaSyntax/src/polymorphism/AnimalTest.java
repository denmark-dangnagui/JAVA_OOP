package polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    public void read() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉 펴고 날아갑니다.");
    }
}


public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();


        //instanceof로 체크
//        if (hAnimal instanceof Human) {
//            Human human = (Human) hAnimal;
//            human.read();
//        }


        //다운 캐스팅
//        Human human = (Human) hAnimal;
//        human.read();
//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(eAnimal);
        animalList.add(tAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

//        for (Animal animal : animalList) {
//            animal.move();
//        }
    }
    // 안정적으로 다운캐스팅을 하기위해서는 instanceof를 쓴다.
    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.read();
            }
            else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
    //다형성으로 인해서 이렇게 아래처럼 Human에 해당하는 매서드와 같이 개별로 하나씩 만들지 않아도 됨.
    public void moveAnimal(Human animal) {
        animal.move();
    }
}
