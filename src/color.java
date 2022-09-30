abstract class color {
        abstract void collection();

    }
    class yellow extends color {
        void collection()
        {
            System.out.println("yellow color ");
        }

        public static void main(String[] args) {
            color c=new yellow();
            c.collection();
        }
    }

