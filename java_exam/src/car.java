class Car {

        String color = "black";
        String name = "k5";
        int x_pos = 0;

        public void goForward(int forward){
            x_pos += forward;
        }

        public int getCarPosition(){
            return x_pos;
        }

        public String getCarColor(){
            return color;
        }
        public String getCarName() {
            return name;
        }

}
