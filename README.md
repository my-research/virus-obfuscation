# Powershell 난독화 종류

- **Powershell 스크립트 난독화**
  - cmdlet 을 이용하여 인코딩/압축/alias 등 여러 난독화 기법을 사용할 수 있음
  - invoke-obfuscation 이라는 도구를 사용해서 단일, 이중, 복합 난독화 지원
  - 공격자가 난독화를 편리하게 할 수 있는 툴
- **종류**
  - Random Case
  - Division
  - Reorder
  - Back Ticks
  - Call Operator
  - Whitespace
  - Ascii Char Assigns
  - Replace
  - Base64 Encoding
  - Invoke-Obfuscation.ps1

# Windows McAfee 보안 설정 끄기

1. window
2. 바이러스 및 위협 방지
3. McAfee 열기
4. 설정 -> 실시간 검사 -> 꺼짐

# Eicar 파일

- **Eicar**
  - Anti-Virus 제품이 잘 동작하는지 확인하기 위해 사용하는 mock virus
  - [Eicar 공식 홈페이지](https://www.eicar.org/?page_id=3950)
  - [Eicar 제공 테스트 악성 코드 String](https://secure.eicar.org/eicar.com.txt)

# Invoke-Obfuscation 사용법

Invoke-Obfuscation 설치 및 실행

```powershell
git clone https://github.com/danielbohannon/Invoke-Obfuscation.git

Import-Module Invoke-Obfuscation.psd1

Invoke-Obfuscation
```
