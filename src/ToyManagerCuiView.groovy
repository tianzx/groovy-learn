
package net.tianzx.main

def printMenu(){
    print""
    println "Welcome to Toy Manager View"
    println '''
        0.Exit System
        1.Add Toy
        2.Display All Toys
        3.Update Toy
        4.Delete Toy
        5.Display Toy
        6.Delete All Toys
                Please Choice:
        '''
    new InputStreamReader(new InputStreamReader(System.in)).readLine()
}
def chioce = printMenu()
while (chioce!=0) {
    if (chioce=='1') {
        println 'Add Toy'
    }else if(chioce=='2'){
        println 'Display All Toys'
    }else if (chioce=='3'){
        println 'Update Toy'
    }else if(chioce=='4'){
        println 'Delete Toy'
    } else if(chioce=='5'){
        println 'Display Toy'
    } else if(chioce=='6'){
        println 'Delete All Toys'
    }
}