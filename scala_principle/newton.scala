object session {
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def isGoodEnough(guess: Double, x:Double) =
    abs(guess * guess - x) / x < 0.001

  def improve(guess: Double, x:Double) =
    (guess + x) / 2

  def sqrt(x: Double) = sqrtIter(1.0, x)
}
