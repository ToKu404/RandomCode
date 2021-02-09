import 'dart:io';

void main() {
  var signature = [0.5, 0.5, 0.5];
  int n = int.parse(stdin.readLineSync());
  print(tribonacci(signature, n));
}

List<num> tribonacci(List<num> signature, int n) {
  List<num> signatures = [];
  for (var i = 0; i < n; i++) {
    if (i >= 3) {
      signatures.add((signature[0] + signature[1] + signature[2]));
      signature[0] = signature[1];
      signature[1] = signature[2];
      signature[2] = signatures[signatures.length - 1];
    } else {
      signatures.add(signature[i]);
    }
  }
  return signatures;
}
