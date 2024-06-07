package main

import "fmt"

func main() {
    var a, b int
    fmt.Scan(&a, &b)
    
    star := ""
    for i := 0; i < b; i++ {
        for j := 0; j < a; j++ {
            star += "*"  
        }
        star += "\n"
    }
    fmt.Printf("%s", star)
}