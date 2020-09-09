1. Viết chương trình kiểm tra một chuỗi có phải là gần đối xứng hay không. Chuỗi được gọi là gần đối xứng nếu ta xóa 1 ký tự từ chuỗi thì ta sẽ có được 1 chuỗi đối xứng.

Ví dụ `abcb` là chuỗi bán đối xứng vì bỏ đi chữ `a` thì ta được chuỗi đối xứng `bcb`, tương tự `abca` cũng bán đỗi xứng vì bỏ đi chữ `b` thì ta được `aca` là đối xứng

2. Viết chương trình sửa lỗi chữ hoa chữ thường theo quy tắc: ký tự bắt đầu câu phải viết hoa, nếu không thì phải viết thường. Quy ước các câu sẽ phân biệt nhau bởi dấu chấm và chấm hỏi

Ví dụ:

```
abc. def ghi --> Abc. Def ghi
ABC? def ghi. xYZ --> Abc? Def ghi. Xyz

```

3.Viết chương trình in ra các số xuất hiện trong một chuối, mỗi số in ra trên một dòng

Ví dụ nếu nhập `abc 123 def 1mno789` thì phải in ra

```
123
1
789
```

4. Một chuỗi IP address luôn có dạng a.b.c.d trong đó 0 <= a, b, c, d <= 255. Nhập vào một chuỗi IP address, kiểm tra xem nó có hợp lệ hay không

Ví dụ:

```
0.0.0.0 --> hợp lệ
223.1.200.133 --> hợp lệ
abcd --> không hợp lệ
111.300.123.123 --> không hợp lệ vì giá trị 300 > 255
123.123.123 --> không hợp lệ vì chỉ có 3 số
123.100.100.100.12 --> khồng hợp lệ vì có tới 5 số
```

Gợi ý: dùng hàm split trước
