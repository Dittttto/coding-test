package main

import (
	"fmt"
)

func main() {
	king := 1
	queen := 1
	knight := 2
	bishop := 2
	rook := 2
	pawn := 8
	var x int
	var y int
	var z int
	var i int
	var j int
	var k int

	fmt.Scanf("%d %d %d %d %d %d", &x, &y, &z, &i, &j, &k)

	fmt.Printf("%d %d %d %d %d %d", (king - x), (queen - y), (rook - z), (bishop - i), (knight - j), (pawn - k))
}
