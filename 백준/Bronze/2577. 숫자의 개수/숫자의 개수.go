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
	var m int
	var w int
	var arr [10]int

	fmt.Fscanf(reader, "%d\n%d\n%d\n", &n, &m, &w)
	result := n * m * w
	for result > 0 {
		mod := result % 10
		arr[mod] += 1
		result /= 10
	}

	for i := 0; i < 10; i++ {
		writer.WriteString(strconv.Itoa(arr[i]))
		writer.WriteString("\n")
	}

	defer writer.Flush()
}
