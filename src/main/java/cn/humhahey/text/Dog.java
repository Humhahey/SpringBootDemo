package cn.humhahey.text;

public class Dog implements Animal {

    @Override
    public void say() {
        System.out.println(this.getClass().getSimpleName());
    }
}
