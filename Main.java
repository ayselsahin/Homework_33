package homework_33;

//Смоделировать предметную область "Телевизор"
//
 //Классы:
//    - Телевизор   TV
//    - Канал       Channel
//    - Передача    Program
//    - Пульт       remote
//
//В телевизоре есть множество каналов.          many channel on tv
//У каждого канала есть множество передач       many programs in channel
//У каждого канала есть номер                   channel has no
//
//Сделать пульт, который имеет ссылку на телевизор .        connect  remote to tv
//У пульта должен быть метод on(номер канала)               remote should has ON
//При вызоове этого метода, канал с нужным номером показывает случайную передачу



public class Main {



    public static void main(String[] args) {

        Remote remote=new Remote();

        Channel[] channelList=new Channel[6];

       /* for (int i = 1; i < 6 ; i++) {
            String num=String.valueOf(i);
            String[] programList ={"n"+num ,"s"+ num,"c" + num ,"d" + num ,"m" + num};
            channelList[i]=new Channel(programList);
        } */

        String[] programList ={"n1","s1","c1","d1","m1"};
        channelList[1]=new Channel(programList);

        programList = new String[]{"n2", "s2", "c2", "d2", "m2"};
        channelList[2]=new Channel(programList);

        programList = new String[]{"n3", "s3", "c3", "d3", "m3"};
        channelList[3]=new Channel(programList);

        programList = new String[]{"n4", "s4", "c4", "d4", "m4"};
        channelList[4]=new Channel(programList);

        programList = new String[]{"n5", "s5", "c5", "d5", "m5"};
        channelList[5]=new Channel(programList);


        while(true)
        {
            int channelNo = remote.Listen();

            if (channelNo == 0) {
                break;
            }

            if (channelNo >5 ){
                System.out.println("No Channel");
                continue;
            }

            int progNo = remote.ON(channelNo);


            System.out.println( "Channel No :" + channelNo +
                    "Prog Name :" + channelList[channelNo].getRandomProgram(progNo));


        }



    }
}
