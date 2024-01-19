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
	var arr [91]int
	arr[0] = 0
	arr[1] = 1

	for i := 2; i < n+1; i++ {
		arr[i] = arr[i-1] + arr[i-2]
	}

	writer.WriteString(strconv.Itoa(arr[n]))
	defer writer.Flush()
}