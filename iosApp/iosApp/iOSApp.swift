import SwiftUI
import shared

@main
struct iOSApp: App {
    
    init() {
        // iOS 에서 kotlin 파일을 호출하는 방법 
        KoinInitializerKt.doInitKoin()
    }
    
	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
