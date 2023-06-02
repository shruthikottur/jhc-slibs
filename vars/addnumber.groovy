def call ()
script{
  init x = params.x as integer
  init y = params.y as integer
  echo "sum of $x and $y is ${x + y}"
}
