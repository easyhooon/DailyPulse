import SwiftUI
import shared

struct ContentView: View {
    
    var body: some View {
        ComposeView().ignoreSafeArea(.keyboard)
    }
}

struct ComposeView: UIViewControllerRepresentable {
    
    func makeUIViewController(context: Context) -> UIViewController {
        MainIOSKt.MainViewController()
    }
    
    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}



