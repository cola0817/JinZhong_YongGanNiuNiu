package edu.jzxy.cbq.chapter_07;

/**
 * @author Cola0817
 * @name ProgrammerLive
 * @date 2023/9/17 11:09
 * @since 1.0.0
 */
public class ProgrammerLive {
    public static void main(String[] args) {
        Programmer cola = new Programmer();
        cola.setName("Cola");
        cola.setLamp(new Lamp("Cola Lamp"));
        cola.setComputer(new Computer("Cola computer"));

        System.out.println("开始工作：");
        cola.doOn(cola.getLamp());
        cola.doOn(cola.getComputer());
        System.out.println("晚安~");
        cola.doOff(cola.getComputer());
        cola.doOff(cola.getLamp());
    }
}
