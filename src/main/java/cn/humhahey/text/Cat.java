package cn.humhahey.text;

public class Cat implements Animal {

    @Override
    public void say() {
        System.out.println(this.getClass().getSimpleName());
    }
}
