fun main() {
    val tree = CherryTree()
    tree.treeType = "deciduous"
    tree.height = 85
    tree.location = "garden"
    tree.yield = 5
    println(tree.printTreeType())
    println(tree.printHeight())
    println(tree.printLocation())
    println(tree.printYield())
}

open class Tree {
    var treeType: String = "Undefined"
        set(word) {
            if ((word == "deciduous") or (word == "conifer")) {
                field = word
            }
        }
        get() {
            print("It's ")
            return field
        }
    var height: Int = 1
        set(value) {
            if ((value > 0) and (value < 115))
                field = value
        }
        get() {
            print("Tree height is ")
            return field
        }
    fun printTreeType() {
        println("$treeType tree.")
    }
    fun printHeight() {
        println("$height m.")
    }
}

class CherryTree : Tree() {
    var location: String = "Undefined"
        get() {
            print("Cherry grows in the ")
            return field
        }
    var yield: Int = 1
        set(value) {
            if ((value > 0) and (value < 16))
                field = value
        }
        get() {
            print("Cherry yield is ")
            return field
        }
    fun printLocation() {
        println("$location.")
    }
    fun printYield() {
        println("$yield kg.")
    }
}