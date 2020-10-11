

//   object Todo {
//     case class Todo(id: Int, content: String)

//     val todos: Seq[Todo] = Seq(Todo(1, "掃除をする"),Todo(2,"ご飯を食べる"))

//     def todo(toods: Seq[Todo]):String = {
//       todos match {
//         case List(Todo(1, _)) => "休日"
//         case List(Todo(2, _))   => "習慣"
//       }
//     }

//     def main(args:Array[String]):Unit = {
//       val todo = new Todo(id: Int, content: String)
//       println(todo.todo(1))
//     }
// }
