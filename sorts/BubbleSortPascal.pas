program BubbleSort(output);
var
  i: integer;
  j: integer;
  time2stop: integer;
  tempValue: integer;
  anArray: array[1..5] of Integer;
  swapped: Boolean;
begin
 i:=0;
 time2stop:= 0;
 swapped:=false; 
 tempValue:=0;
  for i:= 1 to 5 do
   anArray[i]:= random(100);
  for i:=1 to 5 do
    begin
    write(anArray[i]);
    write(' ');
    end;
  write(' :Initial array');
  writeln('');
 
  while time2stop = 0 do
    begin
    swapped:=false;
    for i := 1 to 4 do
    begin
    if anArray[i] > anArray[i+1] then
     begin 
      tempValue:= anArray[i];
      anArray[i]:= anArray[i+1];
      anArray[i+1]:=tempValue;
      swapped := true;
        for j:= 1 to 5 do
         begin
         write(anArray[j]);
         write(' ');
         end;
        writeln('');
     end;// end if
     end;// end for
     if swapped=false then
     time2stop:=1;
    end;//end while
 
  for i:=1 to 5 do
    begin
    write(anArray[i]);
    write(' ');
    end;
  write(' :Sorted array');
  writeln('');
 
end. 