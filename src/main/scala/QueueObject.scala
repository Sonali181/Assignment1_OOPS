object QueueObject extends App
{
  val Obj1 = new DoubleQueue
  val Obj2 = new SquareQueue
  println(Obj1.enqueue(1))
  println(Obj1.enqueue(2))
  println(Obj1.enqueue(3))
  println(Obj1.enqueue(4))
  println(Obj1.getQueue)
  println(Obj2.enqueue(5))
  println(Obj2.enqueue(6))
  println(Obj2.enqueue(7))
  println(Obj2.enqueue(8))
  println(Obj2.getQueue)
  println(Obj2.dequeue(item = 4))
  println(Obj2.getQueue)
  println(Obj2.dequeue(item = 4))
  println(Obj2.getQueue)
}