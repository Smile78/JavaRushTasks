package com.javarush.task2.task17.task1706;

    public final  class OurPresident extends Thread {

        private static OurPresident president;

        static {
            synchronized (OurPresident.class){
//            synchronized (president){
//                if (president==null){
                    president=new OurPresident();
//                }
            }
        }

        private OurPresident(){

        }

        public static  OurPresident getOurPresident(){
            return president;
        }

    }

