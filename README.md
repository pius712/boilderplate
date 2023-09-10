# boilerplate

## 규칙

### class vs record

- 도메인 엔티티의 경우에는 class로 작성할 것.
    - 향후 메서드가 추가될 가능성이 있음.

- 단순히 request 와 같은 객체에는 record 사용할 것.
    - 레코드 사용이 좀 더 단순한 경우임.

## database

docker compose 는 image -> container 생성을 한다. 
