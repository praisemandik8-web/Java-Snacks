from unittest import TestCase

import py_bank

class TestValidateEmail (TestCase):
    def test_that_validate_email_function_exists(self):
        py_bank.validate_email("musa.kayode@.com")
    
    def test_that_validate_email_has_minimun_of_8_characters(self):
        is_valid = py_bank.validate_email("musa.kayode@.com")
        self.assertTrue(is_valid)

    def test_that_valid_email_is_less_than_8_characters_return_false(self):
        is_valid = py_bank.validate_email("musa")
        self.assertFalse(is_valid)

    def test_that_valid_email_contain_special_characters(self):
        actual = py_bank.validate_email("musa.kayode@.com")
        expected = "valid email"
        self.assertEqual(actual, expected)
    
