package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var reader *bufio.Reader = bufio.NewReader(os.Stdin)
	var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

	var n int

	fmt.Fscanf(reader, "%d", &n)
	result := factorial(n)

	writer.WriteString(strconv.Itoa(result))
	defer writer.Flush()
}

func factorial(n int) int {
	if n  < 1{
		return 1
	}

	return n * factorial(n -1)
}