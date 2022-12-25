## 싱글턴 패턴

> 유일무이한 객체를 생성하는 패턴

- 간단한 싱글턴 패턴을 구현하는 것은 쉽지만, 완전하게 유일무이한 객체를 생성하고 유지하는 것은 쉽지 않다.
- thread, reflection, serialize(직렬화/역직렬화) 와 같은 조건에 따라서 싱글턴을 유지할 수 있는 여부가 갈린다.

|                                         | thread-safe | reflection-safe | serialize-safe | performance | lazy/eager | extends(상속 가능 여부) |
|-----------------------------------------|-------------|-----------------|----------------|-------------|------------|---------|
| classicSingleton                        | ❌           | ❌               | ❌              | 🆗          | lazy       | 🆗      |
| ThreadSafeEagerSingleton                | ✅           | ❌               | ❌              | 🆗          | eager      | 🆗      |
| ThreadSafeSyncSingleton                 | ✅           | ❌               | ❌              | ❌           | lazy       | 🆗      |
| ThreadSafeInnerClassSingleton           | ✅           | ❌               | ❌              | 🆗          | lazy       | 🆗      |
| ThreadSafeDCLSingleton                  | ✅           | ❌               | ❌              | 🆗          | lazy       | 🆗      |
| ThreadSafeSerialSafeInnerClassSingleton | ✅           | ❌               | ✅              | 🆗          | lazy       | 🆗      |
| EnumSingleton                           | ✅           | ✅               | ✅              | 🆗          | eager      | ❌       |

> 해당하는 singleton의 이름은 소스코드의 클래스 이름입니다.
