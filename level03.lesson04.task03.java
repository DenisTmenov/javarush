package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Zerg nameZ1 = new Zerg();
        nameZ1.name = "qweqwe";

        Zerg nameZ2 = new Zerg();
        nameZ2.name = "asdasfse";

        Zerg nameZ3 = new Zerg();
        nameZ3.name = "q3242weqwe";

        Zerg nameZ4 = new Zerg();
        nameZ4.name = "qwe345345qwe";

        Zerg nameZ5 = new Zerg();
        nameZ5.name = "qw456456eqwe";

        Zerg nameZ6 = new Zerg();
        nameZ6.name = "qwertyrtyqwe";

        Zerg nameZ7 = new Zerg();
        nameZ7.name = "qwerty565qwe";

        Zerg nameZ8 = new Zerg();
        nameZ8.name = "qwrhgfheqwe";

        Zerg nameZ9 = new Zerg();
        nameZ9.name = "qwereretgqwe";

        Zerg nameZ10 = new Zerg();
        nameZ10.name = "qwrtrytgfeqwe";

        Protos nameP1 = new Protos();
        Protos nameP2 = new Protos();
        Protos nameP3 = new Protos();
        Protos nameP4 = new Protos();
        Protos nameP5 = new Protos();
        nameP1.name = "qweasd";
        nameP2.name = "qweadsfsd";
        nameP3.name = "sdfsdsf";
        nameP4.name = "qweasdfsdfsd";
        nameP5.name = "qwfgfggfeasd";

        Terran nameT1 = new Terran();
        Terran nameT2 = new Terran();
        Terran nameT3 = new Terran();
        Terran nameT4 = new Terran();
        Terran nameT5 = new Terran();
        Terran nameT6 = new Terran();
        Terran nameT7 = new Terran();
        Terran nameT8 = new Terran();
        Terran nameT9 = new Terran();
        Terran nameT10 = new Terran();
        Terran nameT11 = new Terran();
        Terran nameT12 = new Terran();
        nameT1.name = "qweasdfgd";
        nameT2.name = "qwdfgdfeasd";
        nameT3.name = "qweaghjghjsd";
        nameT4.name = "qwghjgheasd";
        nameT5.name = "qghjghjweasd";
        nameT6.name = "qweashjkhjkjkd";
        nameT7.name = "qweahjkhsd";
        nameT8.name = "qwehjknasd";
        nameT9.name = "qweabnmsd";
        nameT10.name = "qweavbnvbnsd";
        nameT11.name = "qweabvnvbvvvsd";
        nameT12.name = "qwebnbnbnbnbasd";



    }

    public static class Zerg
    {
        public String name;


    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}
