import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '')

'Step 2: At Page home, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

'Step 3: At Page home, click on input password'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_password'))

'Step 4: At Page home, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_home/input_password'), input_password)

'Step 5: At Page home, click on input login button'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_login_button'))

'Step 6: At Page home, click on div object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/div_object'))

'Step 7: At Page home, input on input password'

WebUI.setText(findTestObject('AI-Generated/Page_home/input_password'), input_password_1)

'Step 8: At Page home, click on input login button > navigate to Page inventory.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/input_login_button'))

'Step 9: At Page inventory.html, click on button add to cart sauce labs backpack'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_add_to_cart_sauce_labs_backpack'))

'Step 10: At Page inventory.html, click on hyperlink object > navigate to Page cart.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/hyperlink_object'))

'Step 11: At Page cart.html, click on button checkout > navigate to Page checkout-step-one.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_cart_html/button_checkout'))

'Step 12: At Page checkout-step-one.html, click on input firstname'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_firstname'))

'Step 13: At Page checkout-step-one.html, input on input firstname'

WebUI.setText(findTestObject('AI-Generated/Page_checkout-step-one_html/input_firstname'), input_firstname)

'Step 14: At Page checkout-step-one.html, click on input lastname'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_lastname'))

'Step 15: At Page checkout-step-one.html, input on input lastname'

WebUI.setText(findTestObject('AI-Generated/Page_checkout-step-one_html/input_lastname'), input_lastname)

'Step 16: At Page checkout-step-one.html, click on input postalcode'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_postalcode'))

'Step 17: At Page checkout-step-one.html, input on input postalcode'

WebUI.setText(findTestObject('AI-Generated/Page_checkout-step-one_html/input_postalcode'), input_postalcode)

'Step 18: At Page checkout-step-one.html, click on input continue > navigate to Page checkout-step-two.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-one_html/input_continue'))

'Step 19: At Page checkout-step-two.html, click on button finish > navigate to Page checkout-complete.html'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_checkout-step-two_html/button_finish'))

'Step 20: Add visual checkpoint at Page_checkout-complete.html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout Process for Sauce Labs Backpack_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
