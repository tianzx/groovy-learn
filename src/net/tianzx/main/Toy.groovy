package net.tianzx.main

/**
 * Created by tianzx on 2016/6/16.
 */
class Toy {
    def toyName;
    def unitPrice;
    def method(){
        println 'invoke method'
    }
    String toString(){
        "${toyName}"
    }

    public static void main(String[] args) {
        def toy = new Toy(toyName: 'toy1',unitPrice: '100')
        toy.method()
        println toy
    }
}
