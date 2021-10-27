defmodule ProgramacionDeclarativa do
    @moduledoc """
    Programacion declarativa para obtener:
     Maximo comun divisor
	   Diferencia Simetrica
     Conjunto Potencia
     Quicksort
  """
  # Maximo Comun divor
  # Ejemplo de Ejecucion: ProgramacionDeclarativa.mcd(10, 5)
  # Resultado: 5
  def mcd(x, 0), do: x
  def mcd(x, y), do: mcd(y, rem(x,y))

  # Diferencia Simetrica entre 2 conjuntos de nuestros super herores favoritos
  # Ejemplo de Ejecucion: ProgramacionDeclarativa.diferenciasimetrica()
  # Resultado: #MapSet<["Superman", "WonderWoman"]>
  def diferenciasimetrica() do
    a = ~w[Hulk IronMan SpiderMan WonderWoman] |> MapSet.new
    b = ~w[Superman SpiderMan Hulk IronMan] |> MapSet.new
    sym_dif = fn(a,b) -> MapSet.difference(MapSet.union(a,b), MapSet.intersection(a,b)) end
    sym_dif.(a,b)
  end

  #Bitwise
  #Un conjunto de funciones que realizan cálculos en bits.
  #Todas las funciones bit a bit solo funcionan con números enteros; de lo contrario, se genera un ArithmeticError.
  #Ejemplo de ejecucion: ProgramacionDeclarativa.conjuntopotencia([1,2,3,4])
  #Resultado:
  # [
  #   [],
  #   [1],
  #   [2],
  #   [1, 2],
  #   [3],
  #   [1, 3],
  #   [2, 3],
  #   [1, 2, 3],
  #   [4],
  #   [1, 4],
  #   [2, 4],
  #   [1, 2, 4],
  #   [3, 4],
  #   [1, 3, 4],
  #   [2, 3, 4],
  #   [1, 2, 3, 4]
  # ]
  use Bitwise
  def conjuntopotencia(list) do
    n = length(list)
    max = round(:math.pow(2,n))
    for i <- 0..max-1, do: (for pos <- 0..n-1, band(i, bsl(1, pos)) != 0, do: Enum.at(list, pos) )
  end

  #Implementacion de quicksort con doble pivote
  #Ejemplo de ejecucion ProgramacionDeclarativa.quicksort_doble_pivote([6,4,2])
  #Resultado: [2, 4, 6]
  def quicksort_doble_pivote([]), do: []
  def quicksort_doble_pivote([h]), do: [h]
  def quicksort_doble_pivote([h,t]) do
    cond do
      h < t -> [h,t]
      true -> [t,h]
    end
  end
  def quicksort_doble_pivote(list) do
    {primer_pivote, temp_sublist} = List.pop_at(list,
     random_position_in(list))
    {segundo_pivote, target_sublist} = List.pop_at(temp_sublist,
     random_position_in(temp_sublist))

    pequeño_pivote = Enum.min([primer_pivote, segundo_pivote])
    grande_pivote = Enum.max([primer_pivote, segundo_pivote])

    quicksort_doble_pivote(for x <- target_sublist, x < pequeño_pivote, do: x)
    ++ [pequeño_pivote] ++
    quicksort_doble_pivote(for x <- target_sublist, x >= pequeño_pivote, x < grande_pivote, do: x)
    ++ [grande_pivote] ++
    quicksort_doble_pivote(for x <- target_sublist, x >= grande_pivote, do: x)
  end

  defp random_position_in(list) when length(list) > 1, do: :rand.uniform(length(list)) - 1
  defp random_position_in(_), do: 0

end
