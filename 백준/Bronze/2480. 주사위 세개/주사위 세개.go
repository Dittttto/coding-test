package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

	var a int = 0
	var b int = 0
	var c int = 0
	var result int = 0
	fmt.Fscanf(reader, "%d %d %d", &a, &b, &c)

	if a == b && b == c {
		result = 10000 + a*1000
	} else if a != b && b != c && a != c {
		var max int
		max = int(math.Max(float64(a), float64(b)))
		max = int(math.Max(float64(max), float64(c)))

		result = max * 100
	} else {
		var same int
		if a == b && a != c {
			same = a
		} else if a != b && a == c {
			same = c
		} else {
			same = b
		}
		result = 1000 + same*100
	}

	fmt.Fprintf(writer, strconv.Itoa(result))
	defer writer.Flush()
}
