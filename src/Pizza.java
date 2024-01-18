public class Pizza {

    private int price;
    private Boolean veg;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedTakeaway=false;

    private int extraCheese=100;
    private int extraToppings=150;
    private int backPack=20;
    private int basePizzaPrice;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price=320;
        }else {
            this.price=400;
        }
        basePizzaPrice+=this.price;
    }


    public void getPizzaPrice(){
        System.out.println(this.price);
    }

    public void addExtraCheese(){

        isExtraCheeseAdded=true;
        this.price+=extraCheese;


    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;

        this.price+=extraToppings;

    }

    public void takeAway(){
        isOptedTakeaway=true;
        this.price+=backPack;
    }

    public void getBill(){
        String bill="";
        System.out.println("Pizza : "+basePizzaPrice);

        if (isExtraCheeseAdded){
            bill+="Extra Cheese Added "+extraCheese+"\n";
        }

        if (isExtraToppingsAdded){
            bill+="Extra Toppings Added :"+extraToppings+"\n";
        }
        if (isOptedTakeaway){
            bill+="Take Away Added :"+backPack+"\n";
        }

        bill+="Bill "+this.price+"\n";
        System.out.println(bill);

    }




}
