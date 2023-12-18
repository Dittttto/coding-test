package main

import (
	"fmt"
)

func main() {
	var h int
	var m int
	var c int

	fmt.Scanf("%d %d\n%d", &h, &m, &c)
	m += c
	if m >= 60 {
		h += m/60
		h %= 24
		m %= 60
	}

	fmt.Println(h, m)
}
