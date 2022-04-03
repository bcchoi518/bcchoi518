//1. 박스 2개 만들기
//2. 드랍다운 리스트 만들기
//3. 환율정보 들고오기
//4. 드랍다운 리스트에서 아이템 선택하면 아이템이 바뀜
//5. 금액을 입력하면 환전이 된다
//6. 드랍다운 리스트에서 아이템을 선택하면 다시 그 단위 기준으로 환전이 된다
//7. 숫자를 한국어로 읽는법
//8. 반대로 밑에 박스에서 숫자를 바꿔도 위에 박스에 환율이 적용이 된다

let currencyRatio = {
  USD: {
    USD: 1,
    KRW: 1219.77,
    VND: 22839.0,
    unit: '달러',
  },
  KRW: {
    USD: 0.00082,
    KRW: 1,
    VND: 18.72,
    unit: '원',
  },
  VND: {
    USD: 0.000044,
    KRW: 0.053,
    VND: 1,
    unit: '동',
  },
};
//1. console.log(currencyRatio.USD.unit);
//2. console.log(currencyRatio['VND']['unit']);
let fromCurrency = 'USD';
let toCurrency = 'USD';

document.querySelectorAll('#from-currency-list a').forEach((menu) =>
  menu.addEventListener('click', function () {
    //1. 버튼을 가져온다
    //2. 버튼에 값을 바꾼다
    document.getElementById('from-btn').textContent = this.textContent;
    //3. 선택된 currency값을 변수에 저장해준다
    fromCurrency = this.textContent;
    document.getElementById('from-unit').textContent = currencyRatio[fromCurrency]['unit'];
    convert();
  })
);

document.querySelectorAll('#to-currency-list a').forEach((menu) =>
  menu.addEventListener('click', function () {
    //1. 버튼을 가져온다
    //2. 버튼에 값을 바꾼다
    document.getElementById('to-btn').textContent = this.textContent;
    //3. 선택된 currency값을 변수에 저장해준다
    toCurrency = this.textContent;
    document.getElementById('to-unit').textContent = currencyRatio[toCurrency]['unit'];
    convert();
  })
);

//1. 키를 입력하는 순간
//2. 환전이되서
//3. 환전된값이 보인다
function convert() {
  //1. 환전
  //2. 얼마를 환전? 가지고 있는 돈이 뭔지? 바꾸고자하는 돈이 뭔지?
  // 돈 * 환율 = 환전금액
  let amount = document.getElementById('from-input').value;
  let convertedAmount = amount * currencyRatio[fromCurrency][toCurrency];

  document.getElementById('to-input').value = convertedAmount;
}
