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
	var word string

	fmt.Fscanf(reader, "%s", &word)

	left := 0
	right := len(word) - 1
	isP := 1
	for left < right {
		if word[left] != word[right] {
			isP = 0
			break
		}

		left +=1
		right -=1
	}

	writer.WriteString(strconv.Itoa(isP))
	defer writer.Flush()
}
