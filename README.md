# DailyPulse

## Branch 
- main -> CMP(Compose Multiplatform - Android, iOS, Web, Desktop)
- cmp -> CMP(Compose Multiplatform - Android, iOS)
- kmp -> KMP(Kotlin Multiplatform)
## main TODO
- [x] desktop 정상 빌드
- [x] web 정상 빌드
- [ ] 한글 깨짐 이슈 해결 reference) https://holykisa.tistory.com/117 
## cmp TODO
- [x] iosApp 정상 빌드
- [ ] News 아이템을 클릭했을 때, 웹뷰를 통해 뉴스 url 로 이동 
## kmp TODO
- [x] iosApp 정상 빌드
    -> reference) https://stackoverflow.com/questions/77361565/xcode-15-problems-with-previews-in-kmm-projects
- [ ] SqlDelight -> Room
- [ ] ViewModelWrapper -> AAC ViewModel
- [ ] Accompanist PullToRefresh -> M3 PullToRefresh(KMP 지원 여부 확인)
- [ ] News 아이템을 클릭했을 때, 웹뷰를 통해 뉴스 url 로 이동 

## What I learned
<img width="465" alt="image" src="https://github.com/easyhooon/DailyPulse/assets/51016231/fd0c383e-b3fa-49b6-9d66-e96af014ec4b">

- Android Studio 에서도 iosApp 빌드가 가능하다 (백그라운드에 xcode가 존재 해야 하긴함)
  
- What went wrong:
Cannot locate tasks that match ':shared:testClasses' as task 'testClasses' not found in project ':shared'. error 발생
  -> `task("testClasses") {}` 를 shared 모듈 build.gradle.kts 에 추가하여 해결
